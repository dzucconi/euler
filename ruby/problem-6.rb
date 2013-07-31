# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

problem_6 = ((1..100).inject(&:+) ** 2) - (1..100).map { |n| n ** 2 }.inject(&:+)

puts problem_6
# => 25164150
