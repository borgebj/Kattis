def main():
    cases = int(input())

    for _ in range(cases):
        input()  # Ignore the line
        n = int(input())
        sum_val = 0

        # Sum the test case
        for _ in range(n):
            sum_val += int(input())

        # Check if the sum is divisible
        res = "YES" if sum_val % n == 0 else "NO"
        print(res)


if __name__ == "__main__":
    main()