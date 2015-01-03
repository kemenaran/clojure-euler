; 2520 is the smallest number that can be divided by each of the numbers
; from 1 to 10 without any remainder.
;
; What is the smallest positive number that is evenly divisible by all of
; the numbers from 1 to 20?

(defn acceptable? [x]
    (every? #(= 0 (rem x %)) (range 1 21)))

(defn candidates []
    (iterate #(+ 2520 %) 2520))

(println (first (filter acceptable? (candidates))))
