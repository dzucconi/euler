(defn problem-2 []
  "By considering the terms in the Fibonacci sequence whose
  values do not exceed four million, find the sum of the
  even-valued terms."
  (reduce +
        (filter even?
                (take-while #(> 4000000 %)
                            (map first
                                 (iterate (fn [[a b]] [b (+ a b)]) [0 1]))))))

(problem-2)
; => 4613732
