(ns clojure-recipes.core
  (:gen-class))

(defn printNumbers
  "Print numbers less than x"
  ([] (printNumbers 0))
  ([x](println x)
   (if (< x 10)
     (printNumbers (inc x))
     )))

(defn printLoopNumbers
  "loop recur - efficient way to do recusion with clojure"
  [](loop [x 0]
    (println x)
    (if (< x 10) (recur (inc x))
        (println "Done!"))))


