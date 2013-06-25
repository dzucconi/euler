; Problem 1

(defn check [x]
  (if (or (= (rem x 3) 0)
          (= (rem x 5) 0)) x))

(reduce +
  (remove nil?
          (map check (range 1000))))

