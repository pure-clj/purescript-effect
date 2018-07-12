(ns Effect._foreign)

(defn pureE [a]
  (fn [] a))

(defn bindE [a]
  (fn [f]
    (fn []
      ((f (a nil))))))

(defn untilE [f]
  (fn []
    (while (not (f nil)))
    {}))

(defn whileE [f]
  (fn [a]
    (fn []
      (while (f nil)
        (a nil))
      {})))

(defn forE [lo]
  (fn [hi]
    (fn [f]
      (fn []
        (doseq [i (range lo hi)]
          ((f i)))))))

(defn foreachE [as]
  (fn [f]
    (fn []
      (doseq [a as]
        ((f a))))))