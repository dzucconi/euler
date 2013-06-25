(defn problem-1 []
  "Find the sum of all the multiples of 3 or 5 below 1000."
  (reduce +
    (remove nil?
            (map check (range 1000)))))

(defn check [x]
  (if (or (= (rem x 3) 0)
          (= (rem x 5) 0)) x))

(problem-1)
; => 233168

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
