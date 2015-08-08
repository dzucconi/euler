# What is the total of all the name scores in the file?

names = eval("[#{File.open('./names.txt').read}]").sort
char = ->(x) { x.ord - 64 }
score = ->(word, i) { word.split('').map(&char).reduce(:+) * (i + 1) }
problem_22 = names.map.with_index(&score).reduce(:+)

puts problem_22
# => 871198282
