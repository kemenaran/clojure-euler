; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple?
    "Is x multiple of n?"
    [x n]
    (= 0 (mod x n)))

(defn acceptable?
    "Is x multiple of 3 or 5?"
    [x]
    (or (multiple? x 3) (multiple? x 5)))

(println (reduce + (filter acceptable? (range 1000))))
