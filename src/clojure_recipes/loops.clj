(ns clojure-recipes.core
  (:gen-class))

(defn printNumbers
  "Print numbers less than x"
  ([] (printNumbers 0))
  ([x](println x)
   (if (< x 10)
     (printNumbers (inc x))
     )))

