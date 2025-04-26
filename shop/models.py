from itertools import product
from tkinter.font import names

from django.db import models

class Catalog(models.Model):
    name = models.CharField(max_length=125)
    slug = models.SlugField()

    def __str__(self):
        return self.name

class Products(models.Model):
    name = models.CharField(max_length=125)
    opisanie = models.TextField()
    price = models.PositiveIntegerField()
    image = models.ImageField(upload_to='product')
    slug = models.SlugField()
    SIZE_CHOICES = [
        ('XS', 'Extra Small'),
        ('S','Small'),
        ('M', 'Medium'),
        ('L', 'Large'),
        ('XL', 'Extra Large'),
        ('XXL', '2X Large'),
    ]
    size = models.CharField(max_length=3, choices=SIZE_CHOICES)
    available = models.BooleanField(default=True)

    def __str__(self):
        return self.name
