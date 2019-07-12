def get_lcss(s, s_index, t, t_index):
    if s_index == len(s) or t_index == len(t):
        return 0
    else:
        # There are three possible moves from here ... move both, move s, move t.
        # Note that if s[s_index] == t[t_index], then we move both along (can't count either twice).
        move_both = get_lcss(s, s_index + 1, t, t_index + 1) + 1 if s[s_index] == t[t_index] else 0
        move_s = get_lcss(s, s_index + 1, t, t_index)
        move_t = get_lcss(s, s_index, t, t_index + 1)

        # Return the largest of the three moves
        return max([move_both, move_s, move_t])


def longest_common_subsequence(s, t):
    # Create an appropriately sized memo
    memo = [[-1 for i in range(len(t) + 1)] for j in range(len(s) + 1)]
    # Set first row and first column to zero (represents a zero length string => 0 length lcs)
    # Row is s, col is t
    for row in range(len(s) + 1):
        memo[row][0] = 0

    for col in range(len(t) + 1):
        memo[0][col] = 0

    # Do the DP stuff here
    # for loops for s_index and t_index and build up the larger solutions from the smaller solutions.
    # Your code here.
    for i in range(1, len(s)):
        for j in range(1, len(t)):
            memo[i][j] = max(memo[i][j], get_lcss(s, i, t, j))

    # usually return memo[len(s)][len(t)] at this point, but for this exercise
    return memo


l = longest_common_subsequence("XMJYAUZ", "MZJAWXU")
for i in l:
    print(i)
