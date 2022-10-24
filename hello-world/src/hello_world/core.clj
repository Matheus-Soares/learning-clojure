(ns hello-world.core)

(defn foo
  "I don't do a whole lot, just print the message."
  [x]
  (println "Hello, World and", x, "!"))

(foo "Clojure")