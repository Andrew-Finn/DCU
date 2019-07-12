#
#   In this exercise, you need to modify find_number so that it updates a memo. The testing program will be called
#       and should return a completed memo. The memo should be a dictionary containing the computed values for amount.
#
def find_number(amount, coins):
    assert amount >= 0
    if amount == 0:
        return 0  # base case
    else:
        # Try every possibility
        return min([1 + find_number(amount - coin, coins) for coin in coins if coin <= amount])


def testing(amount, coins):
    memo = {}
    number_of_coins = find_number(amount, coins, memo)
    return memo
