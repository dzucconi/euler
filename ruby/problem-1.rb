# Find the sum of all the multiples of 3 or 5 below 1000.

problem_1 =
  (1...1000).select do |n|
    n % 3 == 0 || n % 5 == 0
  end.reduce(:+)

puts problem_1
# => 233168
