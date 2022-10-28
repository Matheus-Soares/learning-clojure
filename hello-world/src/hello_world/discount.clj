(ns hello-world.discount)

; Função que recebe um valor e retorna se o mesmo é maior que 100
(defn apply-discount?
  [value]
  (if (> value 100)
    true
    false)
  )

; Função que recebe um valor e um desconto e faz a subtração dos dois
(defn apply-discount
  [value, discount]
  (- value discount)
  )

; Recebe um valor inicial, verifica se deve aplicar o desconto
; calcula o desconto e aplica o desconto
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