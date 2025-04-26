from zoneinfo import available_timezones

from django.shortcuts import render , get_object_or_404
from .models import Catalog,Products

def product_list(request, category_slug=None):
    category = None
    categories = Catalog.objects.all()
    product = Products.objects.filter(available=True)

    if category_slug:
        category = get_object_or_404(Catalog,slug=category_slug)
        products = product.filter(category=category)

    return render(request,
                  '',
                  {'category':category,
                  'categories': categories,
                  'products':products
                    })

