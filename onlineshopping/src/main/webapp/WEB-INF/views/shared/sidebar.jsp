
<h2 class="my-4" style="color:green;">Cornelius Shop</h2>
<div class="list-group">
    
    <c:forEach items="${categories}" var="category">
    
    <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.name}</a> 
    
    </c:forEach>
</div>