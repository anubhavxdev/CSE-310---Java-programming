#include <iostream>
#include <cmath>

bool isPrime(int num) {
    if (num <= 1) return false;
    if (num <= 3) return true;
    if (num % 2 == 0 || num % 3 == 0) return false;
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) return false;
    }
    return true;
}

void findPrimes(const int arr[], int size, int primes[], int &primeCount) {
    primeCount = 0;
    for (int i = 0; i < size; ++i) {
        if (isPrime(arr[i])) {
            primes[primeCount++] = arr[i];
        }
    }
}

int main() {
    int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int size = sizeof(arr) / sizeof(arr[0]);
    int primes[size];
    int primeCount;

    findPrimes(arr, size, primes, primeCount);

    std::cout << "Prime numbers in the array are: ";
    for (int i = 0; i < primeCount; ++i) {
        std::cout << primes[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}