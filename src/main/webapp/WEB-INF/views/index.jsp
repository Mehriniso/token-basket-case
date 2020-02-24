<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.1.3/materia/bootstrap.min.css">
    <link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>

    <script type="text/javascript"
            src="https://pagead2.googlesyndication.com/pagead/show_ads.js">
    </script>
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>My Basket</title>
</head>
<body>

<h1 class="page-heading">Order Your Coffee</h1>
<!-- Menu -->
<div class="menu">
    <div class="container">
        <div class="row">
            <div class="col-md-9 search-grid">
                <div class="product-container">
                    <div class="menu-list">
                        <div class="panel panel-default" id="content1">
                            <div class="panel-heading"></div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="menu-item-container"><div class="item-name">ESPRESSO</div><div><i class="fa fa-dot-circle-o veg-icon"></i></div>
                                            <div class="item-price-container">
                                                <div class="item-price">
                                                    <i class="fa fa-dolar"></i>15
                                                </div>
                                                <div class="spacer"></div>
                                                <div class="add-button">
                                                    <button class="btn btn-primary sc-add-to-cart" data-name="ESPRESSO" data-price="15" type="submit">ADD</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="menu-item-container"><div class="item-name">IRISH</div><div><i class="fa fa-dot-circle-o veg-icon"></i></div>
                                            <div class="item-price-container">
                                                <div class="item-price">
                                                    <i class="fa fa-dollar"></i>15
                                                </div>
                                                <div class="spacer"></div>
                                                <div class="add-button">
                                                    <button class="btn btn-primary sc-add-to-cart" data-name="IRISH" data-price="15" type="submit">ADD</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="menu-item-container"><div class="item-name">AMERICANO</div><div><i class="fa fa-dot-circle-o veg-icon"></i></div>
                                            <div class="item-price-container">
                                                <div class="item-price">
                                                    <i class="fa fa-dollar"></i>15
                                                </div>
                                                <div class="spacer"></div>
                                                <div class="add-button">
                                                    <button class="btn btn-primary sc-add-to-cart" data-name="AMERICANO" data-price="15" type="submit">ADD</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="menu-item-container"><div class="item-name">MACCHIATO</div><div><i class="fa fa-dot-circle-o veg-icon"></i></div>
                                            <div class="item-price-container">
                                                <div class="item-price">
                                                    <i class="fa fa-dollar"></i>15
                                                </div>
                                                <div class="spacer"></div>
                                                <div class="add-button">
                                                    <button class="btn btn-primary sc-add-to-cart" data-name="MACCHIATO" data-price="15" type="submit">ADD</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div id="cart"></div>
        </div>
            <div class="col-md-9" id="postResultDiv">
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        $('#cart').simpleCart();
    });
</script>
</body>
</html>