(ns hello-world.vectors)

(def prices [10 200 123 601 130 591 890])

(println "Position 0:" (prices 0))
(println "Position 5:" (prices 5))

(println "Position 3 using get:" (get prices 0))
(println "Position 6 using get:" (get prices 6))
(println "Position invalid using get:" (get prices 10))
(println "Position invalid using get with default value (4):" (get prices 10 4))

; Conj não altera o vetor, tudo é imutavel
; Apenas cria um novo vetor para ser usado.
(println "Conj 5:" (conj prices 5))

(println "Inc pos 0:" (inc (prices 0)))

; Update sempre deve receber a posição e a função de alteração
; Também não altera o vetor original
(println "Update pos 0 with inc:" (update prices 0 inc))

(defn increment-10
  [value]
  (+ value 10))

(println "Update pos 0 with custom function increment-10:" (update prices 0 increment-10))

; Map aplica uma função em um conjunto de valores
(println "Increment 10:" (map increment-10 prices))

(println "Range from 0 to 9: (range 10)")

; filter função vetor
(println "Just odd numbers:" (filter odd? (range 10)))

(defn is-more-than-500?
  [value]
  (> value 500))

(println "More than 500: " (filter is-more-than-500? prices))

; Reduce função [valor inicial] vetor
(println "Sum of all prices:" (reduce + prices))

(defn sum-ten-percent-of-value
  [value-1, value-2]
  (+ value-1 (* value-2 0.1)))

; Função deve receber dois valores, o primeiro é a soma e o segundo é o próximo valor
(println "Reduce with custom function: " (reduce sum-ten-percent-of-value 0 [100 100]))