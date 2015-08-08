# By considering the terms in the Fibonacci sequence whose
# values do not exceed four million, find the sum of the even-valued terms.

fib = Enumerator.new do |y|
  a = b = 1
  loop do
    y << a
    a, b = b, a + b
  end
end

limit = 4_000_000

problem_2 = fib.take_while { |n| n <= limit }.select(&:even?).reduce(:+)

puts problem_2
# => 4613732
