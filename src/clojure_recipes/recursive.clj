(ns clojure-recipes.recursive)

(defn recursive
        "This is a recursive procedure"
        [x]
        (println x)
        (if (= x 1)
          "Done!"
          (recursive (dec x))))


(defn nand
        ([& next]
         (loop [count (dec (count next)) result true]
           (if (neg? count)
             (not  result)
             (recur (dec count) (and result (nth next count)))
             )))
         )
