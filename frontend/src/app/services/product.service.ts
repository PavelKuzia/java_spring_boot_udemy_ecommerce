import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../common/product';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ProductService {

  public baseUrl = "http://localhost:8081/api/products"

  constructor(private HttpClient: HttpClient) { }

  getProductList(categoryId: number): Observable<Product[]> {
    const searchUrl: string = `${this.baseUrl}/search/findByCategoryId?id=${categoryId}`;
    return this.HttpClient.get<GetResponse>(searchUrl).pipe(
      map((response) => response._embedded.products)
    )
  }
}

interface GetResponse {
  _embedded: {
    products: Product[];
  }
}