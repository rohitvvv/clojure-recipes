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

(deftest factorialTest
  (testing "Factorial of a n"
    (is (= (factorial 5) (factorialReduce 5)))
    (is (= (factorial 1) (factorialReduce 1)))
    (is (= (factorial 10) (factorialReduce 10)))))

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


(deftest addAnonymousTest
  (testing "Testing an anonymous function"
    (is (= 4 (addAnonymous 2)))))


(deftest incrementerTest
  (testing "Testing a incrementer"
    (def inc2 (incrementer 2))
    (is (= 4 (inc2 2)))
    (is (= 10 (inc2 8)))
    (def inc5 (incrementer 5))
    (is (= 5 (inc5 0)))
    (is (= 10 (inc5 5)))))

(deftest mapTest
  (testing "Testing a squareMap function"
    (def numbers [1 2 3])
    (is (= [1 4 9] (mapsquare numbers)))))


(deftest mapNamesTest
  (testing "Testing a mapNamesFunction. It joins the string in a sequence"
    (is (= '("Rohit Vaidya" "John Rogers") (mapNames ["Rohit" "John"] ["Vaidya" "Rogers"])))))
