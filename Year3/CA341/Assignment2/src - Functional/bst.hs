-- This code is adapted from a Lab Task submission for CA320. As such elements of this code have previously been
-- submitted as graded work by myself for CA320.

data Tree a
  = Null
  | Node a (Tree a) (Tree a)
  deriving (Read, Show)

insert :: Ord a => a -> Tree a -> Tree a
insert node Null = Node node Null Null
insert node (Node root right left)
  | node < root = Node root (insert node right) left
  | otherwise = Node root right (insert node left)

makeTree :: Ord a => [a] -> Tree a
makeTree [] = Null
makeTree (l : ls) = insert l (makeTree ls)

inOrder :: Tree a -> [a]
inOrder Null = []
inOrder (Node value right left) = inOrder right ++ [value] ++ inOrder left

postOrder :: Tree a -> [a]
postOrder Null = []
postOrder (Node value right left) = postOrder right ++ postOrder left ++ [value]

preOrder :: Tree a -> [a]
preOrder Null = []
preOrder (Node value right left) = [value] ++ preOrder right ++ preOrder left

search :: (Ord a) => Tree a -> a -> Bool
search Null _ = False
search (Node value left right) toFind
  | toFind== value = True
  | toFind< value = search left toFind
  | toFind > value = search right toFind
