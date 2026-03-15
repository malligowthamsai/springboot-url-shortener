@GetMapping("/{code}")
public ResponseEntity<?> redirect(@PathVariable String code) {

    Url url = urlRepository.findByShortCode(code);

    return ResponseEntity
           .status(HttpStatus.FOUND)
           .location(URI.create(url.getOriginalUrl()))
           .build();
}
