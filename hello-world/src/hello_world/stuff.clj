(ns hello-world.stuff)


(defn apply-discount?
  [value]
  (if (> value 100)
    true
    false)
  )

(defn apply-discount
  [value, discount]
  (- value discount)
  )

(defn get-final-value
  "Apply the discount or not, depending on the initial value."
  [initial-value]
  (if (apply-discount? initial-value)
    (let [discount-percentage (/ 10 100)
          final-discount (* initial-value discount-percentage)]
      (apply-discount initial-value final-discount)
      )
    initial-value
    )
  )

(println (get-final-value 1000))