% sampleTree(tree(<VALUE>, tree(<VALUE>, tree(<VALUE>, nil, nil), nil), nil)).
% sampleEmptyTree(nil).

insert(ToInsert, nil, tree(ToInsert, nil, nil)).
insert(X, tree(Y, Left, Right), tree(Y, NL, Right)) :-
    X=<Y, !,
    insert(X, Left, NL).
insert(X, tree(Y, Left, Right), tree(Y, Left, NL)) :-
    insert(X, Right, NL).

search(tree(X, _, _), X) :- !.
search(tree(Curr, Left, _), ToFind) :-
    ToFind<Curr, !,
    search(Left, ToFind).
search(tree(_, _, Right), ToFind) :-
    search(Right, ToFind).

inOrder(nil, []).
inOrder(tree(X, Left, Right), IO) :-
    inOrder(Left, LLeft),
    inOrder(Right, LRight),
    append(LLeft, [X|LRight], IO).

preOrder(nil, []).
preOrder(tree(X, Left, Right), PO) :-
    preOrder(Left, LLeft),
    preOrder(Right, LRight),
    append([X|LLeft], LRight, PO).

postOrder(nil, []).
postOrder(tree(X, Left, Right), PO) :-
    postOrder(Left, LLeft),
    postOrder(Right, LRight),
    append(LLeft, LRight, RightE1),
    append(RightE1, [X], PO).


