This is display page

<table border="1px">

	<tr>
		<td>Name</td>
		<td>Price</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<tr ng-repeat="prod in product">
		<td>{{ prod.name }}</td>
		<td>{{ prod.price }}</td>
		<td>
			<button ng-click="updateProduct(prod)"><!-- <input type="checkbox" ng-model="$parent.show"/> -->Edit</button>	
		</td>
		<td>
			<button ng-click="deleteProduct($index)">Delete</button>
		</td>
	</tr>
</table>
<br />
<br/>
<!-- <div ng-show="show">
		<form ng-submit="submitForm()" method="post">
			Name : <input type="text" ng-model="Product.name" value="Product.name"/> 
			<br />
			Price : <input type="text" ng-model="Product.price" value="Product.price" />
			<br />
			 <input type="submit" value="Submit">
		</form>
</div> -->
