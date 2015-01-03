; A palindromic number reads the same both ways. The largest palindrome made
; from the product of two 2-digit numbers is 9009 = 91 × 99.
; 
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindrome? [n]
    (= (seq (str n)) (reverse (str n))))

(defn combinations-between [bottom top]
    (for [a (reverse (range bottom top))
          b (reverse (range a      top))]
        (list a b)))

(defn products-between [bottom top]
    (map #(apply * %) (combinations-between bottom top)))

(println (apply max (filter palindrome? (products-between 100 1000))))
