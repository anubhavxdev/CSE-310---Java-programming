import math

def is_prime(n):
    if n < 2: return False
    if n == 2: return True
    if n % 2 == 0: return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

numbers = [10, 15, 2, 3, 5, 8, 13, 17, 20, 23, 30, 37, 41, 97, 101]

primes = [n for n in numbers if is_prime(n)]
print("Prime numbers:", primes)