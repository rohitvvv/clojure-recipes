(in-ns 'clojure-recipes.core)

(defn greet
  "Prints name passed"
  [name]
  (str "Hello " name))

(def addAnonymous #(+ 2 %))

(defn incrementer
  "Create a configurable incrementer"
  [increment]
  #(+ % increment)) ;Function factory. Returning anonymous function

(defn toUpper
  [string]
  (.toUpperCase string))

(map toUpper (.split "i love clojure" " "))



