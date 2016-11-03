(ns clojure-recipes.core
  (:require [clojure-recipes.core :refer :all])
  (:gen-class))

(load "basic_functions")
(load "loops")
(load "math_functions")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (str "Hello, World!")
  )

(defn foo
  "Prints foo"
  []
  (str "foo"))

;(printNumbers)



