select c.customer_id, c.customer_name
from customers c
    inner join orders o
    ON c.customer_id = o.customer_id
group by c.customer_id, c.customer_name
having count(case when o.product_name = 'A' then 1 END) > 0
    AND count(case when o.product_name = 'B' then 1 END) > 0
    AND count(case when o.product_name = 'C' then 1 END) = 0
order by c.customer_name