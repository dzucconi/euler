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
