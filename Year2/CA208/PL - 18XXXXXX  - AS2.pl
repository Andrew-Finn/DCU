
speed(f,8).
speed(c,100).
speed(t,120).
speed(p,750).

route(dublin, cork, 200, 'fct').
route(cork, dublin, 200, 'fct').
route(cork, corkAirport, 20, 'fc').
route(corkAirport, cork, 25, 'fc').
route(dublin, dublinAirport, 10, 'fc').
route(dublinAirport, dublin, 20, 'fc').
route(dublinAirport, corkAirport, 225, 'p').
route(corkAirport, dublinAirport, 225, 'p').

out_nodes(Modes,X,R):-
  out_nodes_rec(Modes,X,[],R).

out_nodes_rec(Modes,X,A,Res):-
  route(X,N,_,RouteModes),
  atom_chars(Modes,ModeList),
  atom_chars(RouteModes,RouteModeList),
  intersection(ModeList,RouteModeList,[_|_]),
  \+ member(N,A),!,
  out_nodes_rec(Modes,X,[N|A],Res).
out_nodes_rec(_,_,A,A).

time(Modes,From,To,Time):-
  atom_chars(Modes,ModeList),
  route(From,To,Distance,RouteModes),
  atom_chars(RouteModes,RouteModeList),
  intersection(ModeList,RouteModeList,CommonModes),
  fastest_mode_list(CommonModes,MaxMode),
  speed(MaxMode,Speed),
  Time is Distance/Speed.

fastest_mode_list([Mode|Modes],MaxMode):-
  fastest_mode_rec(Modes,Mode,MaxMode).
fastest_mode_rec([Mode|Modes],TmpMax0,MaxMode):-
  fastest_mode(Mode,TmpMax0,TmpMax1),
  fastest_mode_rec(Modes,TmpMax1,MaxMode).
fastest_mode_rec([],MaxMode,MaxMode).
fastest_mode(Mode1,Mode2,Mode1):-
  speed(Mode1,Speed1),
  speed(Mode2,Speed2),
  Speed1 > Speed2, !.
fastest_mode(_,Mode,Mode).

queue_node_time(Node,[[Node,_,Time]|_],Time):- !.
queue_node_time(Node,[_|T],Time):-
  queue_node_time(Node,T,Time).
queue_node_time(_,[],0).

queue_node_parent(_,[],nil).
queue_node_parent(Node,[[Node,Parent,_]|_],Parent):- !.
queue_node_parent(Node,[_|T],Parent):-
  queue_node_parent(Node,T,Parent).

queue_has_node([[Node,_,_]|_],Node):- !.
queue_has_node([_|T],Node):-
  queue_has_node(T,Node).

queue_insert_node(Node,Parent,Time,[Head|Tail],[Head|Tail1]):-
  Head = [_,_,Time1],
  Time > Time1, !,
  queue_insert_node(Node,Parent,Time,Tail,Tail1).
queue_insert_node(Node,Parent,Time,[Head|Tail],[[Node,Parent,Time],Head|Tail]):-
  Head = [_,_,Time1],
  Time =< Time1, !.
queue_insert_node(Node,Parent,Time,[],[[Node,Parent,Time]]).

queue_delete_node(Node,[[Node,_,_]|Tail],Tail):- !.
queue_delete_node(Node,[Head0|Tail0],[Head0|Tail1]):-
  queue_delete_node(Node,Tail0,Tail1).

node(Node,Goal,Modes,Queue,ListDone,Res):-
  Node = [NodeName,_,_],
  NodeName \= Goal,
  out_nodes(Modes,NodeName,Neighbors),
  \+ queue_has_node(ListDone,NodeName),
  update_queue(Node,Modes,Neighbors,ListDone,Queue,Queue1), !,
  Queue1 = [Next|Queue2],
  node(Next,Goal,Modes,Queue2,[Node|ListDone],Res).
node(Node,Goal,_,_,ListDone,Res):-
  Node = [NodeName,_,_],
  NodeName = Goal,
  reverse([Node|ListDone],Res).

update_queue(_,_,[],_,Queue,Queue).
update_queue(ParentNode,Modes,[Node|Nodes],ListDone,QueueIn,QueueOut):-
  queue_has_node(ListDone,Node), !,
  update_queue(ParentNode,Modes,Nodes,ListDone,QueueIn,QueueOut).
update_queue(ParentNode,Modes,[Node|Nodes],ListDone,QueueIn,QueueOut):-
  ParentNode = [ParentName,_,ParentTime],
  time(Modes,ParentName,Node,NodeParentRouteTime),
  NodeTime is ParentTime+NodeParentRouteTime,
  update_queue_node(Modes,ParentName,Node,NodeTime,QueueIn,Queue1),
  update_queue(ParentNode,Modes,Nodes,ListDone,Queue1,QueueOut).

update_queue_node(_,Parent,Node,NodeTime,QueueIn,QueueOut):-
  queue_has_node(QueueIn,Node), !,
  queue_node_time(Node,QueueIn,OldTime),
  ( NodeTime < OldTime
  ->
    queue_delete_node(Node,QueueIn,Queue1),
    queue_insert_node(Node,Parent,NodeTime,Queue1,QueueOut)
  ; QueueOut = QueueIn ).
update_queue_node(_,Parent,Node,NodeTime,QueueIn,QueueOut):-
  queue_insert_node(Node,Parent,NodeTime,QueueIn,QueueOut).

gen_path(From,To,Nodes,Path):-
  make_rpath(From,To,Nodes,RPath),
  reverse(RPath,Path).
make_rpath(N,N,_,[N]):- !.
make_rpath(From,To,Nodes,[To|Path]):-
  queue_node_parent(To,Nodes,Prev),
  make_rpath(From,Prev,Nodes,Path).

journey(S,D,M):-
  node([S,nil,0],D,M,[],[],R),
  gen_path(S,D,R,Path),
  writeln(Path).





