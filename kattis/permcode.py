import sys


def encrypt(syms: list, perm: list, msg: list, x: int):
    n = len(msg)
    cipher = [None] * n

    # 1. calculate integer d as remainder after dividing integer (n^1.5+x) by n
    d = int(n ** 1.5 + x) % n

    # 2. set c[d] to be symbol in S whose position is same as position of m[d] in P
    cipher[d] = syms[perm.index(msg[d])]

    # 3. for each j != d in 0 .. n-1 ...
    for j in range(n):
        if j == d: continue  # skips index same as d
        a = perm.index(msg[j])
        b = syms.index(msg[(j + 1) % n])
        index = a ^ b
        cipher[j] = syms[index]

    return "".join(cipher)


def decrypt(syms: list, perm: list, cipher: list, x: int):
    n = len(cipher)
    msg = [None] * n

    d = int(n ** 1.5 + x) % n

    # revert 2
    msg[d] = perm[syms.index(cipher[d])]

    # revert 3
    for j in range(n):
        if j == d: continue  # skips index same as d
        a = perm.index(cipher[j])
        #msg[j] =

    return "".join(msg)


while True:
    # try:
    x = int(next(sys.stdin).strip())
    if not x: break
    syms = list(next(sys.stdin).strip())
    perm = list(next(sys.stdin).strip())
    cipher = list(next(sys.stdin).strip())

    print("\nfrom", "".join(cipher))
    msg = decrypt(syms, perm, cipher, x)
    print("to", msg)

    # except ValueError:
    #     print(f'Error reading n, first line')

symbols = list("RATE")
permutation = list("TEAR")
msg = list("TEETER")
x = 102
encrypted = encrypt(symbols, permutation, msg, x)

print("\n")
print("".join(symbols))
print("".join(permutation))
print("".join(msg))
print("".join(encrypted))
