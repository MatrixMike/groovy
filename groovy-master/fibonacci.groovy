current = 1 
next = 1
15.times {
	print current + ' '
	newCurrent = next
	next = next + current
	current = newCurrent
	}
	println ' '
	
	
