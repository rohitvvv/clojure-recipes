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

;Clojure style factorial
(defn factorialReduce
  "Calculate factorial"
  ([x]
  (reduce * (range 1  (inc x)))))

(defn fibn
  "Find nth fibonacii"
  [n]
  (loop [index 0 x 1 y 1]
  (if (= index n)
    y ; return y
   (recur (inc index) y (+ x y)))))


(defn isDivisible
     "Returns true if x is divisible by y. False otherwsie"
     [x y]
     (if(= 0 (mod x y))
       Boolean/TRUE
       Boolean/FALSE))                      


(defn isPrime 
    "Find if a number n is prime"
     [n]
     (if (nil? (loop [i 2]
       (if (< i  n)
         (if (isDivisible n i)
             Boolean/FALSE 
             (recur (inc i))))))
       Boolean/TRUE
       Boolean/FALSE))


    

