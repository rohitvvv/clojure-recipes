(ns clojure-recipes.core-test
  (:require [clojure.test :refer :all]
            [clojure-recipes.core :refer :all]))

(deftest test-main
  (testing "Testing the loop"
    (is (= "Hello, World!" (-main)))))

(deftest add-test
  (testing "Testing addition operation"
    (is (= 5 (+ 3 2 )))))

(deftest greetTest
  (testing "Testing greet function"
    (is (= "Hello Rohit" (greet "Rohit")))))

(deftest squareTest
  (testing "Testing square function"
    (is (= 4 (square 2)))))

(deftest areaTest
  (testing "Testing a multi arity function"
    (is (= 2 (area 2)))))

(deftest areaTest
  (testing "Testing a multi arity function"
    (is (= 15 (area 5 3)))))

(deftest factorialTest
  (testing "Factorial of a n"
    (is (= 120 (factorial 5)))
    (is (= 1 (factorial 0)))))

(deftest fibnTest
  (testing "Fibn: nth fibonacii number"
    (is (= 2 (fibn 1)))
    (is (= 5 (fibn 3)))
    (is (= 13 (fibn 5)))))

(deftest isPrimeTest
  (testing "Primality test"
    (is (true? (isPrime 2)))
    (is (true? (isPrime 5)))
    (is (not (true? (isPrime 6))))
    (is (true? (isPrime 151)))))











