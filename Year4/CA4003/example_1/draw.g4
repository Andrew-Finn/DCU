grammar draw;

prog:   stm;
stm:    Init NUMBER NUMBER      # init
        | Up                    # up
        | Down                  # down
        | Left                  # left
        | Right                 # right
        | Draw                  # draw
        | Dispay                # display
        ;




Init : I N I T;
NUMBER : N U M B E R;
Up : U P;

U: ' ';