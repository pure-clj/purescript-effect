(ns Effect.Unsafe._foreign)

(defn unsafePerformEffect [f]
  (f nil))