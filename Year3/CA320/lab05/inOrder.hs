data Tree a = Null
    | Node a (Tree a) (Tree a)
    deriving (Read, Show)

addNode :: Ord a => a -> Tree a -> Tree a
addNode node Null = Node node Null Null
addNode node (Node root right left)
    | node < root = Node root (addNode node right) left
    | otherwise = Node root right (addNode node left)


makeTree :: Ord a => [a] -> Tree a
makeTree [] = Null
makeTree (l:ls) = addNode l (makeTree ls)

inOrder :: Tree a -> [a]
inOrder Null = []
inOrder (Node value right left) = (inOrder right) ++ [value] ++ (inOrder left)