(ns Effect._foreign)

(defn pureE [a]
  (fn [& _] a))

(defn bindE [a]
  (fn [f]
    (fn [& _]
      ((f (a nil))))))

(defn untilE [f]
  (fn [& _]
    (while (not (f nil)))
    {}))

(defn whileE [f]
  (fn [a]
    (fn [& _]
      (while (f nil)
        (a nil))
      {})))

(defn forE [lo]
  (fn [hi]
    (fn [f]
      (fn [& _]
        (doseq [i (range lo hi)]
          ((f i)))))))

(defn foreachE [as]
  (fn [f]
    (fn [& _]
      (doseq [a as]
        ((f a))))))