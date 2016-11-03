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

