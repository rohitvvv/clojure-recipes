(ns clojure-recipes.core
  (:gen-class))

(defn immutabilityfn
  []
  "Immutability Tester"
  (let [a 10 b 20 c 30]
    (list (inc a) (dec b) (inc c) a b c)))
