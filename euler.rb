problem_1 = (1...1000).select do |n|
  n % 3 == 0 || n % 5 == 0
end.reduce(:+)

puts problem_1
# => 233168
