(ns Effect.Uncurried._foreign)

(defn mkEffectFn1 [fu]
  (fn [x]
    ((fu x))))

(defn mkEffectFn2 [fu]
  (fn [a b]
    (((fu a) b))))

(defn mkEffectFn3 [fu]
  (fn [a b c]
    ((((fu a) b) c))))

(defn mkEffectFn4 [fu]
  (fn [a b c d]
    (((((fu a) b) c) d))))

(defn mkEffectFn5 [fu]
  (fn [a b c d e]
    ((((((fu a) b) c) d) e))))

(defn mkEffectFn6 [fu]
  (fn [a b c d e f]
    (((((((fu a) b) c) d) e) f))))

(defn mkEffectFn7 [fu]
  (fn [a b c d e f g]
    ((((((((fu a) b) c) d) e) f) g))))

(defn mkEffectFn8 [fu]
  (fn [a b c d e f g h]
    (((((((((fu a) b) c) d) e) f) g) h))))

(defn mkEffectFn9 [fu]
  (fn [a b c d e f g h i]
    ((((((((((fu a) b) c) d) e) f) g) h) i))))

(defn mkEffectFn10 [fu]
  (fn [a b c d e f g h i j]
    (((((((((((fu a) b) c) d) e) f) g) h) i) j))))

(defn runEffectFn1 [fu]
  (fn [a]
    (fn [& _]
      (fu a))))

(defn runEffectFn2 [fu]
  (fn [a]
    (fn [b]
      (fn [& _]
        (fu a b)))))

(defn runEffectFn3 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [& _]
          (fu a b c))))))

(defn runEffectFn4 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [& _]
            (fu a b c d)))))))

(defn runEffectFn5 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [& _]
              (fu a b c d e))))))))

(defn runEffectFn6 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [& _]
                (fu a b c d e f)))))))))

(defn runEffectFn7 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [& _]
                  (fu a b c d e f g))))))))))

(defn runEffectFn8 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fn [& _]
                    (fu a b c d e f g h)))))))))))

(defn runEffectFn9 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fn [i]
                    (fn [& _]
                      (fu a b c d e f g h i))))))))))))

(defn runEffectFn10 [fu]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fn [i]
                    (fn [j]
                      (fn [& _]
                        (fu a b c d e f g h i j)))))))))))))
