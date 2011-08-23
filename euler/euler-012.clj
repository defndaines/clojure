; The sequence of triangle numbers is generated by adding the natural numbers. So the 7^(th) triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
; 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
; Let us list the factors of the first seven triangle numbers:
; 1: 1
; 3: 1,3
; 6: 1,2,3,6
; 10: 1,2,5,10
; 15: 1,3,5,15
; 21: 1,3,7,21
; 28: 1,2,4,7,14,28
; We can see that 28 is the first triangle number to have over five divisors.
; What is the value of the first triangle number to have over five hundred divisors?

; This takes forever....
(defn euler-012
 ([limit] (euler-012 limit 1 1))
 ([limit tri i]
  (if (> (count (divisors tri)) limit) tri 
   (recur limit (+ tri (inc i)) (inc i)))))

(defn tri-n
 [n]
 (* n (inc n) (/ 1 2)))

; Is there a relationship between the number of divisors and triangular numbers that have a prime indices and are even?

(defn div-count [n] (count (divisors n)))

(first (drop-while #(> 500 (div-count %)) tri-seq))
