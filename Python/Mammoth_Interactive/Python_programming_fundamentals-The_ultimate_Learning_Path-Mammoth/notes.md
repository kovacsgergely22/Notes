# Python Data Science Fundamentals - Comprehensive Bundle jegyzetek


## Elérhető
[Python Data Science Fundamentals - Comprehensive Bundle](https://training.mammothinteractive.com/courses/enrolled/2418912)

## Jegyzetek

```
import numpy as np

x_values = [1,3,2,4,5,6,7,8,9,5, ]
numpy_x_values = np.array(x_values)
print(x_values)
print(type(x_values))
print(numpy_x_values)
print(type(numpy_x_values))

ones_array = np.ones(10,dtype=np.int_)
print(ones_array)
zeros_array = np.zeros(5)
print(zeros_array)
empty_array = np.empty(10)
print(empty_array)

range_array = np.arange(10)
print(range_array)
range_array = np.arange(10, 21)
print(range_array)
range_array = np.arange(10, 101, 10)
print(range_array)

linspace_array = np.linspace(1, 10, 5)
print(linspace_array)

matrix = [[1,2,3],[4,5,6],[7,8,9]]
numpy_matrix = np.array(matrix)
print(matrix)
print(numpy_matrix)
print(np.array([[[1,2],[3,4]],[[5,6],[7,8]]]))

zeros_array = np.zeros((2,3))
print(zeros_array)
ones_array = np.ones((3,2))
print(ones_array)

some_array = np.array([1,2,3,4,5,6,])
reshaped_array = some_array.reshape((2,3))
print(reshaped_array)

def f(r,c):
  return r*c

some_matrix = np.fromfunction(f, (3,3))
print(some_matrix)

some_array = np.array([1,2,3,4,5,6,7,8,9,10])
print(some_array[0])
print(some_array[9])
some_array[9] = 11
print(some_array)

some_matrix = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(some_matrix)
print(some_matrix[0])
print(some_matrix[0,2])
some_matrix[1,1] = 10
print(some_matrix)
some_matrix[2] = np.array([10,11,12])
print(some_matrix)

import numpy as np

some_array = np.array([1,2,3,4,5,6,7,8,9,10])
print(some_array[0:5])
print(some_array[5:10])
print(some_array[-1])
some_array[5:10] = 6
print(some_array)
# some_array[5:10] = np.array([1,2]) not allowed
print(some_array)

some_matrix = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(some_matrix[0,0:2])
print(some_matrix[:,1])
print(some_matrix[:,1:3])
```