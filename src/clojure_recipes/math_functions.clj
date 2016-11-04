(ns clojure-recipes.core
  (:gen-class))

(defn square
  "Square a given number n"
  [n]
  (* n n))


(defn area
  "Multi arity function"
  ([x](* x x))
  ([x y](* x y)))


(defn factorial
  "Calculate factorial"
   ([x]
   (loop [i 1 partialResult 1]
      (if (<= i x)
        (recur (inc i) (* partialResult i))
        partialResult))))


(defn fibn
  "Find nth fibonacii"
  [n]
  (loop [index 0 x 1 y 1]
  (if (= index n)
    y ; return y
   (recur (inc index) y (+ x y)))))


               


