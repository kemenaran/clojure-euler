; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143 ?

(defn primefactors
    ([n]
        (primefactors n 2 '()))
    ([n candidate acc]
    (cond
        (<= n 1)                  acc
        (zero? (rem n candidate)) (recur (/ n candidate) candidate (cons candidate acc))
        :else                     (recur n (inc candidate) acc))))

(println (apply max (primefactors 600851475143)))
