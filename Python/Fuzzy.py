"""Simple fuzzy set complement demo

This program defines two fuzzy sets A and B (as dictionaries mapping
elements -> membership degree in [0,1]) and computes their complements
using the standard formula: mu_complement(x) = 1 - mu(x).

Run with: python Fuzzy.py
"""

from typing import Dict

def complement(fuzzy_set: Dict[str, float]) -> Dict[str, float]:
	return {x: round(1.0 - mu, 4) for x, mu in fuzzy_set.items()}

def print_fuzzy(name: str, fs: Dict[str, float]) -> None:
	print(f"{name}:")
	for x, mu in fs.items():
		print(f"  {x}: {mu}")
	print()

def main() -> None:
	# Example fuzzy sets A and B (elements -> membership degrees)
	A = {
		"a": 0.0,
		"b": 0.2,
		"c": 0.5,
		"d": 0.9,
	}

	B = {
		"a": 1.0,
		"b": 0.6,
		"c": 0.4,
		"d": 0.0,
	}

	print_fuzzy("\nFuzzy set A", A)
	compA = complement(A)
	print_fuzzy("Complement of A", compA)

	print_fuzzy("Fuzzy set B", B)
	compB = complement(B)
	print_fuzzy("Complement of B", compB)

if __name__ == "__main__":
	main()
